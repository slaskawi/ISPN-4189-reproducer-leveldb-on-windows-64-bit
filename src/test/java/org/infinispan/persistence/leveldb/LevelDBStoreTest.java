package org.infinispan.persistence.leveldb;

import org.junit.Test;

public class LevelDBStoreTest {

    public static final String JNI_DB_FACTORY_CLASS_NAME = "org.fusesource.leveldbjni.JniDBFactory";

    @Test
    public void shouldLoadJNIImplementation() throws Exception {
        Class.forName(JNI_DB_FACTORY_CLASS_NAME);
    }

  
}
