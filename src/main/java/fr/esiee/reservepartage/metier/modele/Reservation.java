package fr.esiee.reservepartage.metier.modele;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Réservation d'un équipement par un adhérent (table reservation).
 * La période est [dateDebut, dateFin[ : US10, « un retour le 12 permet un autre départ le 12 ».
 *
 * @param id           identifiant
 * @param reference    obligatoire, unique (US11)
 * @param adherentId   obligatoire : l'utilisateur qui réserve
 * @param equipementId obligatoire : l'équipement réservé
 * @param dateDebut    obligatoire
 * @param dateFin      obligatoire, strictement après dateDebut
 * @param statut       obligatoire
 * @param creeLe       obligatoire : date et heure de la confirmation
 */
public record Reservation(long id, String reference, long adherentId, long equipementId, LocalDate dateDebut,
                          LocalDate dateFin, StatutReservation statut, LocalDateTime creeLe) {
}
