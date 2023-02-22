# Keycloak

Keycloak Oauth2/OIDC

## Docker

```
docker run -p 8080:8000 -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=admin quay.io/keycloak/keycloak:16.1.1
```

# Tutorial

- [Baeldung](https://www.baeldung.com/spring-boot-keycloak)
- [GitHub](https://github.com/eugenp/tutorials/tree/master/spring-boot-modules/spring-boot-keycloak)

# Issue with Keycloak Spring Adapter 

- `The Keycloak team deprecated the Spring adapters. As you can see/check, there is the Keycloak 15.1.0, but no org.keycloak:keycloak-spring-boot-starter:15.1.0. The last was 15.0.2 keycloak.org/2021/12/keycloak-1510-released.html. Then, probably we need to replace the Keycloak adapter instead expect a solution by Keycloak team. –
  Paulo Mateus
  Dec 17 '21 at 13:43`
- [StackOverflow](https://stackoverflow.com/questions/70207564/spring-boot-2-6-regression-how-can-i-fix-keycloak-circular-dependency-in-adapte)
