package ai.capture.api.dto.screenshots;

import com.frameworkium.api.dto.AbstractDTO;

public class Screenshot extends AbstractDTO<Screenshot> {

    public Command command;
    public String imageURL;
    public String timestamp;
    public String url;

}
