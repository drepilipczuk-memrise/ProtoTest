Output

    syntax = "proto2";


    // serial name 'com.memrise.domain.Car'
    message Car {
      optional string name = 1;
      optional Colour colour = 2;
      // WARNING: an empty collection decoded when a value is missing
      repeated Wheel wheels = 3;
    }

    // serial name 'com.memrise.domain.Colour?'
    enum Colour {
      RED = 0;
      BLACK = 1;
      GREEN = 2;
    }

    // serial name 'com.memrise.domain.Wheel'
    message Wheel {
      optional int32 size = 1;
    }
