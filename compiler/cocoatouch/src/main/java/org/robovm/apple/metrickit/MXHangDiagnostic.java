/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.metrickit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetricKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MXHangDiagnostic/*</name>*/ 
    extends /*<extends>*/MXDiagnostic/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MXHangDiagnosticPtr extends Ptr<MXHangDiagnostic, MXHangDiagnosticPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MXHangDiagnostic.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MXHangDiagnostic() {}
    protected MXHangDiagnostic(Handle h, long handle) { super(h, handle); }
    protected MXHangDiagnostic(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "callStackTree")
    public native MXCallStackTree getCallStackTree();
    @Property(selector = "hangDuration")
    public native NSMeasurement<NSUnitDuration> getHangDuration();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
