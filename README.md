
#  SwagLabs mobile E2E

Proyecto de automatización multiplataforma (Ios y Android)

Puedes descargar la app en el siguiente link: https://github.com/saucelabs/sample-app-mobile/releases

------------

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

Ejecución IOS:

Buying_Products: https://portal.kobiton.com/sessions/6301069 

