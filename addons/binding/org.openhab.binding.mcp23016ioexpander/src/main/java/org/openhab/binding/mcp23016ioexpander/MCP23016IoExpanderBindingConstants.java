/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.mcp23016ioexpander;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link MCP23016IoExpanderBindingConstants} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Xavier Raemy - Initial contribution
 */
public class MCP23016IoExpanderBindingConstants {

    private static final String BINDING_ID = "mcp23016ioexpander";

    // List of all Thing Type UIDs
    public static final ThingTypeUID THING_TYPE_VALVESWITCHBOARD = new ThingTypeUID(BINDING_ID, "ValveSwitchBoard");

    // List of all Channel ids
    public static final String CHANNEL_1 = "channel1";
    public static final String CHANNEL_2 = "channel2";
    public static final String CHANNEL_3 = "channel3";
    public static final String CHANNEL_4 = "channel4";
    public static final String CHANNEL_5 = "channel5";
    public static final String CHANNEL_6 = "channel6";
    public static final String CHANNEL_7 = "channel7";
    public static final String CHANNEL_8 = "channel8";
    public static final String CHANNEL_9 = "channel9";
    public static final String CHANNEL_10 = "channel10";

}
