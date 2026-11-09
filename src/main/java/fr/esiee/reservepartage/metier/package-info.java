/**
 * Règles métier : services appelés par l'interface et objets du modèle
 * (utilisateur, équipement, réservation, emprunt).
 *
 * <p>Toutes les règles du sujet vivent ici : droits par rôle, disponibilité,
 * statuts, validations. Un test peut appeler un service directement,
 * sans fenêtre, et les règles s'appliquent quand même (US03).</p>
 *
 * <p>Utilise {@code donnees} pour lire et écrire, et {@code ia} pour la suggestion.
 * N'utilise jamais {@code ui}.</p>
 *
 * <p>Équipe : back.</p>
 */
package fr.esiee.reservepartage.metier;
