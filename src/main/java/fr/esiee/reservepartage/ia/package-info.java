/**
 * Intégration IA : appel du modèle préentraîné, consigne envoyée, contrôle de la réponse.
 *
 * <p>Sujet B2-05 : « L'IA aide à conseiller un matériel. » Entrées limitées au besoin saisi
 * et aux fiches des matériels actifs. La suggestion reste distincte des données métier
 * et ne les modifie jamais.</p>
 *
 * <p>Appelé uniquement par {@code metier}, qui vérifie les droits avant de construire le contexte.
 * N'utilise ni {@code ui} ni {@code donnees}.</p>
 *
 * <p>Équipe : back (fonctionnalité secondaire dans le livrable 02).</p>
 */
package fr.esiee.reservepartage.ia;
