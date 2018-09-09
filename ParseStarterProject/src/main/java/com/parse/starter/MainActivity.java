/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.parse.starter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.parse.ParseObject;
import com.parse.ParseQuery;


public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);


   /*   ParseObject pontuacao = new ParseObject("Pontuacao");  //cria um objecto e salva os seus dados
      pontuacao.put("nome","Bruno");
      pontuacao.put("pontos", 100 );
     // pontuacao.saveInBackground();
      pontuacao.saveInBackground(new SaveCallback() {
          @Override
          public void done(ParseException e) {
              if (e == null){
                  Toast.makeText(MainActivity.this, "OK, Salvo", Toast.LENGTH_SHORT).show();
              }
          }
      });

*/

      ParseQuery<ParseObject> consultaPontos = ParseQuery.getQuery("Pontuacao");

    // ParseAnalytics.trackAppOpenedInBackground(getIntent());
  }

}
