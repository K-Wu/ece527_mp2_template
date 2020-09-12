package gcd

object EmitVerilog extends App {
  chisel3.Driver.execute(args, () => new GCD)
  chisel3.Driver.execute(args, () => new DecoupledGcd(8))
}

