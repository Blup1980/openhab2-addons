/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.mcp23016ioexpander.internal;

import static org.openhab.binding.mcp23016ioexpander.MCP23016IoExpanderBindingConstants.*;

import java.util.Collections;
import java.util.Set;

import org.openhab.binding.mcp23016ioexpander.handler.MCP23016IoExpanderHandler;
import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.thing.ThingTypeUID;
import org.eclipse.smarthome.core.thing.binding.BaseThingHandlerFactory;
import org.eclipse.smarthome.core.thing.binding.ThingHandler;

/**
 * The {@link MCP23016IoExpanderHandlerFactory} is responsible for creating things and thing
 * handlers.
 *
 * @author Xavier Raemy - Initial contribution
 */
public class MCP23016IoExpanderHandlerFactory extends BaseThingHandlerFactory {

    private static final Set<ThingTypeUID> SUPPORTED_THING_TYPES_UIDS = Collections.singleton(THING_TYPE_VALVESWITCHBOARD);

    @Override
    public boolean supportsThingType(ThingTypeUID thingTypeUID) {
        return SUPPORTED_THING_TYPES_UIDS.contains(thingTypeUID);
    }

    @Override
    protected ThingHandler createHandler(Thing thing) {
        ThingTypeUID thingTypeUID = thing.getThingTypeUID();

        if (thingTypeUID.equals(THING_TYPE_VALVESWITCHBOARD)) {
            return new MCP23016IoExpanderHandler(thing);
        }

        return null;
    }
}
