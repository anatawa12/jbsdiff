package io.sigpipe.jbsdiff;

import java.io.OutputStream;

public interface Compression<X extends Throwable> {
    OutputStream apply(OutputStream t) throws X;
}
