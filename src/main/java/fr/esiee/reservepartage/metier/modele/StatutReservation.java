package fr.esiee.reservepartage.metier.modele;

/**
 * Cycle de vie d'une réservation : CONFIRMEE, puis EN_COURS à la remise, puis CLOTUREE au retour.
 * ANNULEE est possible tant que la réservation n'a pas commencé (US12).
 * C'est le seul endroit où le statut est stocké : l'emprunt n'en a pas.
 */
public enum StatutReservation {
    CONFIRMEE,
    ANNULEE,
    EN_COURS,
    CLOTUREE
}
