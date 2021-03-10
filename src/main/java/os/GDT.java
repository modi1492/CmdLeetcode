package os;

import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@ToString
@Builder
public class GDT {
    private String segmentBase;
    private String G;
    private String DorB;
    private String L;
    private String AVL;
    private String segmentBound;
    private String P;
    private String DPL;
    private String S;
    private Integer TYPE;
    private String TYPE_DESC;

}
