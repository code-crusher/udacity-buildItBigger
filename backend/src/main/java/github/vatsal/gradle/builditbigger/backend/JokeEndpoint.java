/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package github.vatsal.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import github.vatsal.joker.Joker;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "jokerapi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "builditbiggerbackend.gradle.vatsal.github",
                ownerName = "builditbiggerbackend.gradle.vatsal.github",
                packagePath = ""
        )
)
public class JokeEndpoint {

    @ApiMethod(name = "tossMeJoke")
    public JokeModel tossMeJoke() {
        return new JokeModel(Joker.tossMeJoke());
    }

}
