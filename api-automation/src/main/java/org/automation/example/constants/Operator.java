package org.automation.example.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Operator {
    GT("greater than"),
    GTE("greater than equals"),
    LT("less than"),
    LTE("less than equals"),
    EQ("equals"),
    BTW("between");

    public static Operator valueOfLabel(String label) {
        for (Operator e : values()) {
            if (e.label.equals(label)) {
                return e;
            }
        }
        return null;
    }

    private final String label;
}
