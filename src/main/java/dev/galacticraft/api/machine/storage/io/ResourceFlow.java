/*
 * Copyright (c) 2019-2022 Team Galacticraft
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package dev.galacticraft.api.machine.storage.io;

import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;

public enum ResourceFlow {
    INPUT(new TranslatableText("ui.galacticraft.side_option.in").setStyle(Style.EMPTY.withColor(Formatting.GREEN))),
    OUTPUT(new TranslatableText("ui.galacticraft.side_option.out").setStyle(Style.EMPTY.withColor(Formatting.DARK_RED))),
    BOTH(new TranslatableText("ui.galacticraft.side_option.io").setStyle(Style.EMPTY.withColor(Formatting.BLUE)));

    private final Text name;

    ResourceFlow(Text name) {
        this.name = name;
    }

    public Text getName() {
        return this.name;
    }

    public boolean canFlowIn(ResourceFlow direction) {
        return this == direction || this == BOTH;
    }
}
