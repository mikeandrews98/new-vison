<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Candidato;
use Auth;
use Illuminate\Support\Facades\DB;

class EnderecoController extends Controller
{
  public function formularioEnderecoCand(){
  
    return view('endereco.endereco-candidato');
  }
}
