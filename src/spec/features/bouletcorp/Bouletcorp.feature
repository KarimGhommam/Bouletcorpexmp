@Bouletcorp
Feature: Je verfie la page
  En tant que Utilisateur je souhaite me conneecter au site Bouletcorp

  Scenario: Je me registre sur le site Bouletcorp
    Given je me connecte sur l application Bouletcorp
    When je clique sur le bouton Aléatoire
    And je verifie que la page a change
    Then je verifie que les widgets facebook, twitter et tumblr sont bien affichés
