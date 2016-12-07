package de.it.puzzles.mfc.api.common;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("common")
public class CommonApi {

    //region #Public Methods
    @GET
    @Path("/{text}")
    public String apiCheck(@PathParam("text") String text) {

        return "MFC-API: " + text;
    }
    //endregion #Public Methods
}
