package fr.esiee.reservepartage.metier.modele;

/**
 * Fiche de matériel (table equipement). Le sujet prévoit « un exemplaire par fiche ».
 * Pas de champ « disponibilité » : elle se calcule à partir des réservations (US10).
 *
 * @param id          identifiant
 * @param reference   obligatoire, unique (US08)
 * @param nom         obligatoire
 * @param categorie   obligatoire
 * @param description facultative
 * @param etat        obligatoire : DISPONIBLE ou HORS_SERVICE
 * @param archive     vrai si la fiche est archivée (US08 : archivée plutôt que supprimée)
 */
public record Equipement(long id, String reference, String nom, Categorie categorie, String description,
                         EtatEquipement etat, boolean archive) {
}
