
@créeruncomte
Feature: Ornikar page Assurance-Auto Connexion/Créer un compte Ui Test

  Background: Steps commun
    Given I go to the OrnikarAssurance-Auto page
    When  I accept cookies
    And I press <Connexion>
    And I choose Ornikar
    And I press on <je m'inscris>
    And I use the native keyboard to enter my firstname into the prénom input field
    And I use the native keyboard to enter my lastname into the nom input field
    And I use the native keyboard to enter valid date of birth in the Date de naissance input field

  @NonRegressionTest
  @smokeTest
  Scenario: TC01 The user can create his Ornikar user account by entering all valid information.
    And I use the native keyboard to enter valid ZIP Code  in the <Code Postale> input field
    And I use the native keyboard to enter valid phone number in the <Numéro de téléphone> input field
    And I use the native keyboard to enter valid Email in the <Adresse email> input field
    And I use the native keyboard to enter valid password in the <Mot de passe> input field
    And I tick the box <J accepte de recevoir des offres commerciales de la part d Ornikar.>
    And I tick the box <J accepte et je comprends les conditions générales d utilisation et la politique de confidentialité d Ornikar.>
    Then I press to <Je m'inscris>
    And I can create my account
    And I close the browser

  @NonRegressionTest
  Scenario Outline: TC02 The user can't create his Ornikar user account if he enters an invalid ZIP Code.
    And I use the native keyboard to enter INVALIDE ZIP Code  in the "<Code Postale>" input field
    And I use the native keyboard to enter valid phone number in the <Numéro de téléphone> input field
    And I use the native keyboard to enter valid Email in the <Adresse email> input field
    And I use the native keyboard to enter valid password in the <Mot de passe> input field
    And I tick the box <J accepte de recevoir des offres commerciales de la part d Ornikar.>
    And I tick the box <J accepte et je comprends les conditions générales d utilisation et la politique de confidentialité d Ornikar.>
    Then I press to <Je m'inscris>
    And I should see the message <Veuillez saisir un code postal valide>.
    And I close the browser

                 Examples:
                   |Code Postale|
                   |gfjkfjgk|
                   |::;:;:|
                   |323fdf::|

  @NonRegressionTest
  Scenario Outline: TC03 The user can't create his Ornikar user account if he enters an invalid phone number.
    And I use the native keyboard to enter valid ZIP Code  in the <Code Postale> input field
    And I use the native keyboard to enter INVALIDE phone number in the "<Numéro de téléphone>" input field
    And I use the native keyboard to enter valid Email in the <Adresse email> input field
    And I use the native keyboard to enter valid password in the <Mot de passe> input field
    And I tick the box <J accepte de recevoir des offres commerciales de la part d Ornikar.>
    And I tick the box <J accepte et je comprends les conditions générales d utilisation et la politique de confidentialité d Ornikar.>
    Then I press to <Je m'inscris>
    And I should see the message <Veuillez saisir un numéro de téléphone valide>.
    And I close the browser
                  Examples:
                    |Numéro de téléphone|
                    |dfdfdfd|
                    |....??./|
                    |323fdf::|

  @NonRegressionTest
  Scenario Outline: TC04 The user can't create his Ornikar user account if he enters an invalid Email.
    And I use the native keyboard to enter valid ZIP Code  in the <Code Postale> input field
    And I use the native keyboard to enter valid phone number in the <Numéro de téléphone> input field
    And I use the native keyboard to enter INVALIDE Email in the "<Adresse email>" input field
    And I use the native keyboard to enter valid password in the <Mot de passe> input field
    And I tick the box <J accepte de recevoir des offres commerciales de la part d Ornikar.>
    And I tick the box <J accepte et je comprends les conditions générales d utilisation et la politique de confidentialité d Ornikar.>
    Then I press to <Je m'inscris>
    And I should see the message <Veuillez saisir un email valide (ex: michael@gmail.com)>.
    And I close the browser
                  Examples:
                    |Adresse email|
                    |okangurbuz06hotmail.com|
                    |@hotmail.com|
                    |okangurbuz06@|
                    |okangurbuz06@hotmail|
                    |dfdfdff|


  @NonRegressionTest
  Scenario Outline: TC05 The user can't create his Ornikar user account if he enters an invalid password.
    And I use the native keyboard to enter valid ZIP Code  in the <Code Postale> input field
    And I use the native keyboard to enter valid phone number in the <Numéro de téléphone> input field
    And I use the native keyboard to enter valid Email in the <Adresse email> input field
    And I use the native keyboard to enter INVALIDE password in the "<Mot de passe>" input field
    And I tick the box <J accepte de recevoir des offres commerciales de la part d Ornikar.>
    And I tick the box <J accepte et je comprends les conditions générales d utilisation et la politique de confidentialité d Ornikar.>
    Then I press to <Je m'inscris>
    And I can't create my account
    And I close the browser
    #12 caractères minimum
    #1 majuscule
    #1 minuscule
    #1 chiffre
    #1 caractère spécial
                    Examples:
                      |Mot de passe|
                      |Acabbqaz12;|
                      |acabbqaz123;|
                      |ACABBQAZ123;|
                      |Acabbqazaaa;|
                      |cabbqazaaaa1|
