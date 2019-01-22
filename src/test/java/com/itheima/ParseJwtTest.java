package com.itheima;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

/**
 * @program: javaee-dev47
 * @description:
 * @author: ZLW
 * @create: 2019-01-22 10:05
 **/
public class ParseJwtTest {
	public static void main(String[] args) {
		String token = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2NjYiLCJzdWIiOiLlsI_nmb0iLCJpYXQiOjE1NDgxMjU0MTAsImV4cCI6MTU0ODEyNTQ2OSwicm9sZXMiOiJhZG1pbiIsImxvZ28iOiJsb2dvLnBuZyJ9.9gNi8OWIjVzfsu-YxPkEK1gQ-JeGE9ci-kzVX1te0oM";
		Claims claims = Jwts.parser().setSigningKey("itcast").parseClaimsJws(token).getBody();
		System.out.println("id:"+claims.getId());
		System.out.println("subject:"+claims.getSubject());
		System.out.println("issuedat:"+claims.getIssuedAt());
		System.out.println("roles:"+claims.get("roles"));
		System.out.println("logo:"+claims.get("logo"));
	}
}
