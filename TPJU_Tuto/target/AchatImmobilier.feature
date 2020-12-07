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
Feature: US001 Achat d'immobilier
  En tant que Agence Immobilier
  Je souhaite que je sois notifier de l'achat d'un immobilier
  Afin de pouvoir l'ajouter à la liste d'immobiliers disponibles
 
  Scenario: Acheter un immobilier
    Given Immobilier disponible
    When Je décide d'acheter un immobilier
    Then Je reçois une confirmation de l'achat du bien

    
    
    
    
    
    