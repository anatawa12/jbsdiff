package io.sigpipe.jbsdiff;

import java.io.InputStream;

public interface Decompression<X extends Throwable> {
    InputStream apply(InputStream t) throws X;
}
