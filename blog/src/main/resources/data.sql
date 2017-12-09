INSERT INTO USERS (USERNAME, PASSWORD) VALUES ('emilio', '123456');

INSERT INTO BLOG(ID, NAME, TITLE, DESCRIPTION, USER_USERNAME) VALUES (1, 'Meu blog', 'Meu primeiro contato com Spring MVC + Thymeleaf', 'Aqui vou falar um pouco sobre tecnologia e desenvolvimento de software em geral.','emilio');

INSERT INTO POST(ID, TITLE, TEXT, BLOG_ID, USER_USERNAME, DATE) VALUES(1, 'Spring MVC Rules', 'Spring Web MVC is the original web framework built on the Servlet API and included in the Spring Framework from the very beginning. The formal name "Spring Web MVC" comes from the name of its source module spring-webmvc but it is more commonly known as "Spring MVC". Parallel to Spring Web MVC, Spring Framework 5.0 introduced a reactive stack, web framework whose name Spring WebFlux is also based on its source module spring-webflux. This section covers Spring Web MVC. The next section covers Spring WebFlux. For baseline information and compatibility with Servlet container and Java EE version ranges please visit the Spring Framework Wiki.', 1, 'emilio', NULL);

INSERT INTO POST(ID, TITLE, TEXT, BLOG_ID, USER_USERNAME, DATE) VALUES(2, 'Um pouco sobre Thymeleaf', 'Thymeleaf é um motor de templates que tem levantado uma questão interessante nos últimos tempos: Por que usar Thymeleaf? JSP não é bom? Sim, o JSP é bom, mas vale muito a pena dar uma chance para o Thymeleaf, que é uma engine de templates com algumas vantagens importantes para nossos projetos e vem ganhando muita popularidade. Esse é um motor diferente de outros que temos por aí e, inclusive, alguém que talvez goste dele é o seu programador front-end. Você já vai entender isso. :)', 1, 'emilio', NULL);