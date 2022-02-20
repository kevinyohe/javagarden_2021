
import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class SomeErrorDetail {
    private String fieldName;
    private String field;
    private String errorDescription;
}
