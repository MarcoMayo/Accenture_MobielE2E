
#  SwagLabs mobile E2E

Proyecto de automatización multiplataforma (Ios y Android)

### Tecnologías Utilizadas
- Lenguaje de programación: Gherkin, java
- Framework de automatización: Appium, Serenity BDD (Screenplay pattern)

-------

Puedes descargar la app en el siguiente link: https://github.com/saucelabs/sample-app-mobile/releases

------------

### Ejecución de las Pruebas
Desde la raíz de proyecto en la carpeta \SwagLabs_mobileE2E ejecutar por línea de comando

Para ejecutar por feature:

```
Gradlew clean test --tests SignedInRunner  

Gradlew clean test --tests BuyingProductsRunner  
```

Para ejecutar por escenario o tag:

```
Gradlew clean test --tests SignedInRunner -Dcucumber.filter.tags="@SuccessfullySigned" aggregate

Gradlew clean test --tests BuyingProductsRunner -Dcucumber.filter.tags="@Buying_Products" aggregate
```

### Resultados y resportes:

Android: SwagLabs_mobileE2E/Reports/SwagLabs_Android.zip

IOS: SwagLabs_mobileE2E/Reports/SwagLabs_IOS.zip

#### Ejecución IOS Kobiton:

SuccessfullySigned: https://portal.kobiton.com/sessions/6301057

Buying_Products: https://portal.kobiton.com/sessions/6301069 

