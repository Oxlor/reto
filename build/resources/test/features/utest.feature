#Autor: Alvaro Portela
@stories
Feature: Academy Choucair
  As a user, I want to work as a freelance tester and connect with other testers
  @scenario1
  Scenario: Register at the website
    Given than John wants to work as a freelance tester and connect with other testers
    When he fill all the required information for the registration
    | strFirstName | strLastName | strEmail        | strValueMonth | strValueDay | strValueYear | strCity   | strZip | strCountry | strOs   | strVersion | strLanguage | strMobileDevice | strModel | strOsMobile | strPassword     | strConfirmPassword |
    | Juan         | Lopez       | juanl@gmail.com | number:10     | number:14   | number:1991  | Sincelejo | 700001 | Colombia   | Windows | 7          | Spanish     | Fly             | IQ443    | Android 4.1 | @mf-TTs${$DE3/s | @mf-TTs${$DE3/s    |
    Then he sees the button Complete Setup
