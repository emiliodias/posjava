package br.com.blazon.oauth2;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorizationController {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping("/authorize")
	public void authorize(HttpServletRequest request, HttpServletResponse response) {

		String clientId = "fooClientIdPassword";
		String responseType = "code";
		String redirectUri = "http://localhost:8081/callback";

		String authorizationUri = "http://localhost:8090/oauth/authorize";

		String redirect = String.format("%s?client_id=%s&response_type=%s&redirect_uri=%s", authorizationUri, clientId, responseType,
				redirectUri, authorizationUri);

		try {
			response.sendRedirect(redirect);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@RequestMapping("/callback")
	public String callback(HttpServletRequest req, HttpServletResponse resp) {

		String code = req.getParameter("code");

		System.out.println(String.format("Code recebido: %s", code));

		String clientId = "fooClientIdPassword";
		String clientSecret = "secret";

		String redirectUri = "http://localhost:8081/callback";

		CloseableHttpClient client = HttpClients.createDefault();

		HttpPost httpPost = new HttpPost("http://localhost:8090/oauth/token");

		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("grant_type", "authorization_code"));
		params.add(new BasicNameValuePair("code", code));
		params.add(new BasicNameValuePair("redirect_uri", redirectUri));

		String auth = "Basic "
				+ Base64.getEncoder().encodeToString(new String(clientId + ":" + clientSecret).getBytes());

		httpPost.addHeader("Authorization", auth);

		try {
			httpPost.setEntity(new UrlEncodedFormEntity(params));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		CloseableHttpResponse response = null;

		try {
			response = client.execute(httpPost);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String body = null;
		try {
			body = EntityUtils.toString(response.getEntity());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JSONObject object = new JSONObject(body);

		String accessToken = (String) object.get("access_token");

		return "Access Token: " + accessToken;

	}

}