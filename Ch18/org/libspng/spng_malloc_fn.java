// Generated by jextract

package org.libspng;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface spng_malloc_fn {

    jdk.incubator.foreign.MemoryAddress apply(long x0);
    static MemoryAddress allocate(spng_malloc_fn fi) {
        return RuntimeHelper.upcallStub(spng_malloc_fn.class, fi, constants$44.spng_malloc_fn$FUNC, "(J)Ljdk/incubator/foreign/MemoryAddress;");
    }
    static MemoryAddress allocate(spng_malloc_fn fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(spng_malloc_fn.class, fi, constants$44.spng_malloc_fn$FUNC, "(J)Ljdk/incubator/foreign/MemoryAddress;", scope);
    }
    static spng_malloc_fn ofAddress(MemoryAddress addr) {
        return (long x0) -> {
            try {
                return (jdk.incubator.foreign.MemoryAddress)constants$44.spng_malloc_fn$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

