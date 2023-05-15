$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("product.feature");
formatter.feature({
  "line": 2,
  "name": "Product Test",
  "description": "As user I want to verify that six products are displayed on page",
  "id": "product-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "duration": 2817144400,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should be able to verify six products are displayed on page",
  "description": "",
  "id": "product-test;user-should-be-able-to-verify-six-products-are-displayed-on-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter username \"standard_user\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter password \"secret_sauce\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I should be able to verify that six products are displayed on page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 104478900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 18
    }
  ],
  "location": "LoginSteps.iEnterUsername(String)"
});
formatter.result({
  "duration": 107104800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 18
    }
  ],
  "location": "LoginSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 67376800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 98238000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldLoginSuccessfully()"
});
formatter.result({
  "duration": 18000,
  "status": "passed"
});
formatter.match({
  "location": "ProductSteps.iShouldBeAbleToVerifyThatSixProductsAreDisplayedOnPage()"
});
formatter.result({
  "duration": 34714000,
  "status": "passed"
});
formatter.after({
  "duration": 109000,
  "status": "passed"
});
});