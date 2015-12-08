package SDK;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * Denne klasse indenholder selve forbindelsen til severen.
 * Samt attributter  der får serveren til at udfører handlinger.
 */

public class ServerConnection {

    /**
     * Opretter en konstruktør
     */

    public ServerConnection() {

        /**
         * Initialisering af variabler fra konstruktør
         */

        this.hostAddress = "http://localhost";
        this.port = 8888;
    }

    /**
     * Deklarering af lokale variabler!
     */

    private String hostAddress;
    private int port;

    /**
     * Der laves settes
     * @param hostAddress
     */

    public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getHostAddress() {
        return hostAddress;
    }

    public int getPort() {
        return port;
    }

    /**
     * Metoden bruges til at hente(get) noget fra serveren
     * @param path er stien hvor vi vil hente noget fra serveren fra
     * @return
     */

    public String get(String path) {

        Client client = Client.create();

        WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/api/" + path);
        ClientResponse response = webResource.type("application/json").get(ClientResponse.class);

        String output = response.getEntity(String.class);
        System.out.println(output);
        return output;
    }

    /**
     * Metoden bruges til at sende(post) noget til serveren
     * @param path er stien hvor vi vil poste noget til serveren
     * @return
     */

    public String post(String json, String path) {

        Client client = Client.create();

        WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/api/" + path);
        ClientResponse response = webResource.type("application/json").post(ClientResponse.class, json);

        String output = response.getEntity(String.class);
        System.out.println(output);

        return output;
    }

    /**
     * Metoden bruges til at slette noget fra serveren
     * @param path er stien hvor vi vil slette noget fra serveren af
     * @return
     */
    public String delete( String path) {

        Client client = Client.create();
        System.out.println(getHostAddress() + ":" + getPort() + "/api/" + path);
        WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/api/" + path);
        ClientResponse response = webResource.type("application/json").delete(ClientResponse.class);

        return response.getEntity(String.class);
    }

    /**
     * Metoden bruges til at tilføje noget der opdatere til serveren
     * @param path er stien hvor vi vil opdatere noget i serveren
     * @return
     */

    public String put(String path, String json) {


        Client client = Client.create();
        System.out.println(getHostAddress() + ":" + getPort() + "/api/" + path);
        WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/api/" + path);
        ClientResponse response = webResource.type("application/json").put(ClientResponse.class, json);

        String output = response.getEntity(String.class);

        return output;
    }
}


