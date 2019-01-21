/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package net.troja.eve.esi.api;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.model.CharacterLocationResponse;
import net.troja.eve.esi.model.CharacterOnlineResponse;
import net.troja.eve.esi.model.CharacterShipResponse;

/**
 * API tests for LocationApi
 */
public class LocationApiTest extends GeneralApiTest {

    private final LocationApi api = new LocationApi();

    @Before
    public void setUp() {
        api.setApiClient(apiClient);
    }

    /**
     * Get character location
     *
     * Information about the characters current location. Returns the current solar system id, and also the current station or structure ID if applicable  ---  This route is cached for up to 5 seconds  SSO Scope: esi-location.read_location.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdLocationTest() throws ApiException {
        final CharacterLocationResponse response = api.getCharactersCharacterIdLocation(characterId, DATASOURCE, null, null);

        assertThat(response.getSolarSystemId(), greaterThan(0));
    }
    
    /**
     * Get character online
     *
     * Checks if the character is currently online  ---  This route is cached for up to 60 seconds  SSO Scope: esi-location.read_online.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdOnlineTest() throws ApiException {
        CharacterOnlineResponse response = api.getCharactersCharacterIdOnline(characterId, DATASOURCE, null, null);
        assertThat(response, notNullValue());
    }
    
    /**
     * Get current ship
     *
     * Get the current ship type, name and id  ---  This route is cached for up to 5 seconds  SSO Scope: esi-location.read_ship_type.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdShipTest() throws ApiException {
        final CharacterShipResponse response = api.getCharactersCharacterIdShip(characterId, DATASOURCE, null, null);

        assertThat(response.getShipItemId(), greaterThan(0l));
        assertThat(response.getShipTypeId(), greaterThan(0));
    }

}
