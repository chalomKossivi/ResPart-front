/**
 * Accès aux données : connexion SQLite, création des tables et requêtes JDBC.
 *
 * <p>Seul endroit du code qui contient du SQL. Les requêtes sont paramétrées
 * ({@code PreparedStatement}, US07). Aucune règle métier ici : on lit et on écrit,
 * le package {@code metier} décide.</p>
 *
 * <p>N'utilise ni {@code ui}, ni {@code metier} (hors objets du modèle), ni {@code ia}.</p>
 *
 * <p>Équipe : back.</p>
 */
package fr.esiee.reservepartage.donnees;
