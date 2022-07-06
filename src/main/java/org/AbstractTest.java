package org;

public abstract class AbstractTest {
    private Integer id;

    public AbstractTest() {
    }

    public AbstractTest(Integer id) {
        this.id = id;
    }

    public static void main(String[] args) {
        AbstractTest at = new AbstractTest() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
    }
}
