package fr.esiee.reservepartage.metier.modele;

/**
 * Compte de l'application (table utilisateur).
 *
 * @param id               identifiant
 * @param email            obligatoire, unique : sert d'identifiant de connexion
 * @param nom              obligatoire
 * @param prenom           obligatoire
 * @param motDePasseHache  obligatoire, jamais le mot de passe en clair (US04)
 * @param role             obligatoire : ADHERENT ou GESTIONNAIRE
 */
public record Utilisateur(long id, String email, String nom, String prenom, String motDePasseHache, Role role) {
}
