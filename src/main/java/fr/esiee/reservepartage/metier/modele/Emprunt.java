package fr.esiee.reservepartage.metier.modele;

import java.time.LocalDate;

/**
 * Remise puis retour du matériel (table emprunt). Créé à la remise (US13), complété au retour (US14).
 * Les champs du retour restent vides (null) tant que le matériel n'est pas rendu.
 *
 * @param id                   identifiant
 * @param reservationId        obligatoire, unique : une seule remise par réservation
 * @param dateRemise           obligatoire
 * @param gestionnaireRemiseId obligatoire : le gestionnaire qui remet le matériel
 * @param dateRetour           rempli au retour, jamais avant dateRemise
 * @param gestionnaireRetourId rempli au retour
 * @param etatRetour           rempli au retour : BON ou ENDOMMAGE
 * @param observation          facultative
 */
public record Emprunt(long id, long reservationId, LocalDate dateRemise, long gestionnaireRemiseId,
                      LocalDate dateRetour, Long gestionnaireRetourId, EtatRetour etatRetour, String observation) {
}
