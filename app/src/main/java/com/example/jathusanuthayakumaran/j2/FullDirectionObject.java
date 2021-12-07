package com.example.jathusanuthayakumaran.j2;

/*** Created by jathusanuthayakumaran on 28/02/2018.*/

import io.mapwize.mapwizeformapbox.model.Direction;
import io.mapwize.mapwizeformapbox.model.DirectionPoint;

class FullDirectionObject {

    Direction direction;
    DirectionPoint from;
    DirectionPoint to;

    FullDirectionObject(Direction direction, DirectionPoint from, DirectionPoint to) {
        this.direction = direction;
        this.from = from;
        this.to = to;
    }

}
