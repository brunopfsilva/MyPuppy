/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package pt.mercadobit.mypuppy.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import pt.mercadobit.mypuppy.R;


public class mainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);


      // ParseAnalytics.trackAppOpenedInBackground(getIntent());
  }


}
