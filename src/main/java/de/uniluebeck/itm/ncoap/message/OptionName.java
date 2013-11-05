/**
 * Copyright (c) 2012, Oliver Kleine, Institute of Telematics, University of Luebeck
 * All rights reserved
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the
 * following conditions are met:
 *
 *  - Redistributions of source messageCode must retain the above copyright notice, this list of conditions and the following
 *    disclaimer.
 *
 *  - Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the
 *    following disclaimer in the documentation and/or other materials provided with the distribution.
 *
 *  - Neither the name of the University of Luebeck nor the names of its contributors may be used to endorse or promote
 *    products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE
 * GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package de.uniluebeck.itm.ncoap.message;

/**
 * Created with IntelliJ IDEA.
 * User: olli
 * Date: 31.10.13
 * Time: 15:05
 * To change this template use File | Settings | File Templates.
 */
public abstract class OptionName {

    //Name          Number      OptionType  MinLength   MaxLength
    public static final int IF_MATCH        = 1;
    public static final int URI_HOST        = 3;
    public static final int ETAG            = 4;
    public static final int IF_NONE_MATCH   = 5;
    public static final int URI_PORT        = 7;
    public static final int LOCATION_PATH   = 8;
    public static final int URI_PATH        = 11;
    public static final int CONTENT_FORMAT  = 12;
    public static final int MAX_AGE         = 14;
    public static final int URI_QUERY       = 15;
    public static final int ACCEPT          = 17;
    public static final int LOCATION_QUERY  = 20;
    public static final int PROXY_URI       = 35;
    public static final int PROXY_SCHEME    = 39;
    public static final int SIZE_1          = 60;
}
