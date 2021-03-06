
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/cookie_manager.mojom
//

package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;

public final class CookieChangeCause {


    public static final int INSERTED = 0;

    public static final int EXPLICIT = INSERTED + 1;

    public static final int UNKNOWN_DELETION = EXPLICIT + 1;

    public static final int OVERWRITE = UNKNOWN_DELETION + 1;

    public static final int EXPIRED = OVERWRITE + 1;

    public static final int EVICTED = EXPIRED + 1;

    public static final int EXPIRED_OVERWRITE = EVICTED + 1;


    private static final boolean IS_EXTENSIBLE = false;

    public static boolean isKnownValue(int value) {
        switch (value) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
        }
        return false;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value))
            return;

        throw new DeserializationException("Invalid enum value.");
    }

    private CookieChangeCause() {}

}