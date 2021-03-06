/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.maxcul.internal;

/**
 * Define device types
 *
 * @author Paul Hampson (cyclingengineer)
 * @since 1.6.0
 */
public enum MaxCulDevice {
    CUBE(0),
    RADIATOR_THERMOSTAT(1),
    RADIATOR_THERMOSTAT_PLUS(2),
    WALL_THERMOSTAT(3),
    SHUTTER_CONTACT(4),
    PUSH_BUTTON(5),
    LED_MODE(0xfb), // not official MAX!
    CREDIT_MONITOR(0xfc), // not official MAX!
    PAIR_MODE(0xfd), // not official MAX!
    LISTEN_MODE(0xfe), // not official MAX!
    UNKNOWN(0xff); // not official MAX!

    private final int devType;

    private MaxCulDevice(int idx) {
        devType = idx;
    }

    public int getDeviceTypeInt() {
        return devType;
    }

    public static MaxCulDevice getDeviceTypeFromInt(int idx) {
        for (int i = 0; i < MaxCulDevice.values().length; i++) {
            if (MaxCulDevice.values()[i].getDeviceTypeInt() == idx) {
                return MaxCulDevice.values()[i];
            }
        }
        return UNKNOWN;
    }
}
