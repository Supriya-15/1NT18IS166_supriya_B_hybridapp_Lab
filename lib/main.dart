import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(
    home:RowApp(),
  ));
}

class RowApp extends StatelessWidget {
  const RowApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return

    MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text("Multi Row and Column"),
        ),

      body:Padding(
        padding: const EdgeInsets.all(8.0),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.spaceEvenly,
            crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Row(
              mainAxisAlignment: MainAxisAlignment.start,
              children: [
                Container(
    height:100,
    width:100,
    color:Colors.blue,
    child:Center(
    child:Text(
    'First Child'
    )
    ),
    ),
                Row(
                  mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      Container(
      height:100,
      width:100,
      color:Colors.green,
      child:Center(
          child:Text(
              'Third Child'
          )
      )
  ),


            Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Container(
    height:100,
    width:100,
    color:Colors.blue,
    child:Center(
    child:Text(
    'First Child'
    )
    )
    ),

              ],
            )
                      ]
                ),

              ],
            )
          ],
        ),

//THIS IS FOR ROW AND COLUMN
//       child:Column(
// mainAxisAlignment: MainAxisAlignment.spaceEvenly,
// crossAxisAlignment: CrossAxisAlignment.start,
// children: [
//   Container(
//     height:100,
//     width:100,
//     color:Colors.blue,
//     child:Center(
//     child:Text(
//     'First Child'
//     )
//     )
//     ),
//   Container(
//       height:100,
//       width:100,
//       color:Colors.red,
//       child:Center(
//           child:Text(
//               'Second Child'
//           )
//       )
//   ),
//   Container(
//       height:100,
//       width:100,
//       color:Colors.green,
//       child:Center(
//           child:Text(
//               'Third Child'
//           )
//       )
//   ),
// ],
// )
    ),
      ),
    );
    //);
  }
}

//
