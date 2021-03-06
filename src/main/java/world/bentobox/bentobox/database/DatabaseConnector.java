package world.bentobox.bentobox.database;

/**
 *
 * Creates a connection to a database.
 *
 */
public interface DatabaseConnector {

    /**
     * Establishes a new connection to the database
     *
     * @return A new connection to the database using the settings provided
     */
     Object createConnection();
     
     /**
     * Close the database connection
     */
    void closeConnection();
    
    /**
     * Returns the connection url
     *
     * @return the connector's URL
     */
     String getConnectionUrl();

    /**
     * Looks through the database (or files) and returns a known unique key
     * @param tableName - name of the table
     * @return a unique key for this record
     */
     String getUniqueId(String tableName);

    /**
     * Check if a key exists in the database in this table or not
     * @param tableName - name of the table
     * @param key - key to check
     * @return true if it exists
     */
     boolean uniqueIdExists(String tableName, String key);

}

