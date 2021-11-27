package hello.upload.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UPloadFile {

    private String uploadFileName;
    private String storeFileName;
}
