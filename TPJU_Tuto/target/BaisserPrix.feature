#Author: anis.si-youcef@dauphine.eu
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@Tag 
Feature: US002 Studios en promotion
	En tant que Agence Immobilier
	Je veux baisser le prix de mes studios
	Afin de pouvoir les ajouter dans la liste des immobiliers en promotion
 
  Scenario: Baisser le prix des studios de 500 euros
    Given Les studios rattachés à mon agence
    When Je baisse les prix de ces biens
    Then Ces studios sont donc disponibles en promotion
  
 
 
 
 
 
 
 
 
