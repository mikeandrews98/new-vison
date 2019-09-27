<?php

namespace App\Http\Controllers;

use App\Candidato;
use App\NivelUsuario;
use App\Usuario;
use Auth;

use Illuminate\Http\Request;

class CandidatoController extends Controller
{
  public function formularioCandidato(){
    if(Auth::user()->){

    }
    return view('candForm');
  }

  public function novoCandidato(Request $request){

    // dd($request->all());
    $this->validate($request, [
      'nome' => 'required',
      'cpf' => 'required|min:11|max:11',
      'rg' => 'required',
      'nascimento' => 'required|date',
      'descricao' => 'required',
    ]);


    $candidato = Candidato::create([
      'nomeCandidato' => $request->input('nome'),
      'cpfCandidato' => $request->input('cpf'),
      'rgCandidato' => $request->input('rg'),
      'dataNascimentoCandidato' => $request->input('nascimento'),
      'descricaoCandidato' => $request->input('descricao'),
      'codUsuario' => Auth::user()->codUsuario
    ]);

    return view('candForm')->with('ok', $candidato->save());
  }
}