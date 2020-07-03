$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/14693/eclipse-workspace-AutomationPracticalExam/CucumberTest/src/test/java/features/changeBackground.feature");
formatter.feature({
  "line": 1,
  "name": "Change Background Color",
  "description": "\tAs a user I want to change background color  \r\n\t\tso that it is SkyBlue or White",
  "id": "change-background-color",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7399995000,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should be able to change background color to Sky Blue",
  "description": "",
  "id": "change-background-color;user-should-be-able-to-change-background-color-to-sky-blue",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on the button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "ChangeBackgroundSteps.set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "duration": 185779500,
  "status": "passed"
});
formatter.match({
  "location": "ChangeBackgroundSteps.i_click_on_the_button()"
});
formatter.result({
  "duration": 72784300,
  "status": "passed"
});
formatter.match({
  "location": "ChangeBackgroundSteps.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 45700300,
  "status": "passed"
});
formatter.after({
  "duration": 689312500,
  "status": "passed"
});
});