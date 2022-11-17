# Autor: Luisa
@stories
Feature: Selection Test
  As a user, I want to register on the page Utest.com
  @scenarios1
  Scenario: Enter the Utest.com page
     Given that Luisa wants to register
      When He proceeds to click on the registration option (JOIN TODAY)
      | strFirstName | strLastName | strEmailAdress | strLanguageSpoke | strCity | strPotalCode | strPassword | strConfirmPassword |
      |<strFirstName>|<strLastName>|<strEmailAdress>|<strLanguageSpoke>|<strCity>|<strPotalCode>|<strPassword>|<strConfirmPassword>|
      Then He fills out the form in order to create a new Username.
      | strConfirmPassword |
      |<strConfirmPassword>|

  Examples:
    | strFirstName | strLastName |    strEmailAdress    | strLanguageSpoke | strCity | strPotalCode | strPassword | strConfirmPassword |
    |     Luisa    |   Acevedo   |lumaacevedo@utp.edu.co|      English     |Medellin |     050026   | Country1234 |     Country1234    |



