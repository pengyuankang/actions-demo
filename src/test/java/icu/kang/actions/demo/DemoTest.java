package icu.kang.actions.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * @author kang
 * @since 2021/7/3
 */
public class DemoTest {

    @Test(expected = UnsupportedOperationException.class)
    public void testThrow() {
        Demo.testThrow();
    }
}