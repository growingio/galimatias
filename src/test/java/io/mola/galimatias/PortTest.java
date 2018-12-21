/**
 * Copyright (c) 2013-2014 Santiago M. Mola <santi@mola.io>
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
 * OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 */
package io.mola.galimatias;

import junit.framework.TestCase;

/**
 * Port tests
 */
@SuppressWarnings("static-method")
public final class PortTest extends TestCase {

    public void test() throws Exception {
        assertEquals(-1, URL.parse("http://www.baidu.com").originalPort());
        assertEquals(80, URL.parse("http://www.baidu.com").port());

        assertEquals(-1, URL.parse("https://www.baidu.com").originalPort());
        assertEquals(443, URL.parse("https://www.baidu.com").port());

        assertEquals(80, URL.parse("http://www.baidu.com:80").originalPort());
        assertEquals(80, URL.parse("http://www.baidu.com:80").port());

        assertEquals(443, URL.parse("https://www.baidu.com:443").originalPort());
        assertEquals(443, URL.parse("https://www.baidu.com:443").port());

        assertEquals(8080, URL.parse("http://www.baidu.com:8080").originalPort());
        assertEquals(8080, URL.parse("http://www.baidu.com:8080").port());
    }
}
