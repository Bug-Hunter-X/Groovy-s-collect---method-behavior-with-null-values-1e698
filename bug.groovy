```groovy
def methodWithUnexpectedBehavior(List<String> list) {
  if (list == null || list.isEmpty()) {
    return null // Or throw an exception, depending on your requirements
  }

  def result = list.collect { it.toUpperCase() }
  return result
}

println methodWithUnexpectedBehavior(null) // Output: null
println methodWithUnexpectedBehavior([]) // Output: []
println methodWithUnexpectedBehavior(['a', 'b', 'c']) // Output: [A, B, C]

// Unexpected behavior when an element is null
println methodWithUnexpectedBehavior(['a', null, 'c']) // Output: [A, null, C] 
```